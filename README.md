@OptIn(ExperimentalCoroutinesApi::class)
class SaveUserIdUseCaseTest {

    private lateinit var localStorageRepository: FakeLocalStorageRepositoryImpl
    private lateinit var userInfoKeystoreIdentifierUseCase: UserInfoKeystoreIdentifierUseCase
    private lateinit var saveUserIdUseCase: SaveUserIdUseCase

    @Before
    fun setUp() {
        localStorageRepository = FakeLocalStorageRepositoryImpl()

        // Fake identifier use case (deterministic)
        userInfoKeystoreIdentifierUseCase = mockk()
        every {
            userInfoKeystoreIdentifierUseCase("testKey")
        } returns "secureIdentifier"

        saveUserIdUseCase = SaveUserIdUseCase(
            localStorageRepository,
            userInfoKeystoreIdentifierUseCase
        )

        // 🔑 THIS IS THE KEY PART
        mockkObject(AES)
    }

    @After
    fun tearDown() {
        unmockkObject(AES)
    }

    @Test
    fun `invoke encrypts and saves user id successfully`() = runTest {
        // Arrange
        val data = "testUserId"
        val encryptedValue = "encryptedUserId"
        val iv = "encryptionIV".toByteArray()

        every {
            AES.encryptWithAes(data, "secureIdentifier", false)
        } returns Pair(encryptedValue, iv)

        // Act
        val result = saveUserIdUseCase(data, "testKey")

        // Assert - return value
        assertEquals(encryptedValue, result)

        // Assert - storage
        assertEquals(
            encryptedValue,
            localStorageRepository.getString(UserInfo.UserId.userInfo.first)
        )

        assertEquals(
            iv,
            localStorageRepository.getByteArray(UserInfo.UserId.userInfo.second)
        )
    }
}
