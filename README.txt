QR Code App

- Settings

	AndroidManifest.xml => Permission for Camera e Scanner (Vibrate)
	build.gradle(Module: QR_Code_App.app) => Implementation Library
	values folder - colors.xml => Add colours
	values folder - themes.xml => Change setting
	res folder - drawable => Paste icon from www.flation.com
	AndroidManifest.xml => Change android:icon & android:roundIcon

- Splash Screen (MainActivity)

	activity_main.xml => Change setting (Screen)
		- idIVLogo (Logo)
	MainActivity.java => Change Coding (Start App & Call HomeActivity)
	

- Menu (HomeActivity)

	Create new activity => HomeActivity
	activity_home.xml => Change setting
		- idIVLogo (Logo)
		- idTVHeading (Welcome Message)
		- idBtnGenerateQR (Generator Button)
		- idBtnScanQR (Scanner Button)
		
	Drawable Resource File => button_back.xml (Setting shape button)

	HomeActivity.java => Change Coding
		- generateQRBtn = idBtnGenerateQR (Generator Button)
		- scanQRBtn = idBtnScanQR (Scanner Button)

- Generate a new QR Code (GenerateQRCodeActivity)

	Create new activity => GenerateQRCodeActivity 
	activity_generate_qrcode.xml => Change setting 
		- idFLQrCode (Frame View)
		- idTVGenerateQR (Default Text View)
		- idIVQRCode (QR Code Image View)
		- idTILData (Label)
		- idEdtData (Input Data)
		- idBtnGenerateQR (Generate Button)

	GenerateQRCodeActivity.java => Change Coding
		- qrCodeTV = idTVGenerateQR (Default Text View)
		- qrCodeIV = idIVQRCode (QR Code Image View)
		- dataEdt = idEdtData (Input Data)
		- generateQRBtn = idBtnGenerateQR (Generate Button)

- Scan the existing QR Code (ScanQRCodeActivity)

	Create new activity => ScanQRCodeActivity
	activity_scan_qrcode.xml => Change setting 
		- idCamView (Cam View)
		- scannerTV
	
	ScanQRCodeActivity.java => Change Coding
		- scannerLiveView = idCamView (Cam View)
		- scannerTV = idTVScannedData (Default Text View)



