@Test
fun `when domain valid and QR not expired then ValidateQRCode intent is triggered`() = runTest {
    // GIVEN
    val response = "qr-response"
    val intent = ValidateQRCodeIntent.ValidateExpiryTime(/* mock data */)

    val qrData = QrLoginData(
        expiry = 123456789L
    )

    every { validateDomainUseCase(response) } returns true
    every { extractQrLoginDataUseCase(response) } returns qrData
    every { qrCodeLoginExpiredUseCase(qrData.expiry.toString()) } returns true

    val spyViewModel = spyk(
        QrLoginViewModel(
            validateDomainUseCase,
            extractQrLoginDataUseCase,
            qrCodeLoginExpiredUseCase
        ),
        recordPrivateCalls = true
    )

    // WHEN
    spyViewModel.handleQrLoginUrl(response, intent)
    advanceUntilIdle()

    // THEN
    verify {
        spyViewModel["handleIntent"](
            ValidateQRCodeIntent.ValidateQRCode(intent, qrData)
        )
    }

    assertFalse(spyViewModel.uiState.value.invalidQR)
}