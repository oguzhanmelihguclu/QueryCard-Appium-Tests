📱 QueryCart Mobil Test Otomasyon Projesi
Bu proje, QueryCart internet sitesine ait mobil uygulamanın Pixel 8 Pro cihazı üzerinde Android 14.0 sürümü ile test edilmesi amacıyla hazırlanmıştır. Testler, Cucumber tabanlı yapı ile Appium framework'ü kullanılarak gerçekleştirilmiş olup, sonuçlar Allure Reports ile raporlanmıştır.

🚀 Kullanılan Teknolojiler ve Araçlar
Araç / Teknoloji	Açıklama
Java (OpenJDK 23)	Test senaryolarının yazım dili
Cucumber	BDD (Behavior Driven Development) yaklaşımı
Appium	Mobil uygulama otomasyonu aracı
Selenium WebDriver	UI etkileşimleri (mobil tarayıcıda)
TestNG	Test yönetimi
Allure	Raporlama aracı
Maven	Bağımlılık yönetimi ve proje yapılandırması
Android Emulator	Pixel 8 Pro / Android 14.0

📱 Test Edilen Platform
Site: QueryCart

Cihaz: Pixel 8 Pro

Android Sürümü: 14.0

Tarayıcı (Mobil Web Testi): Chrome / WebView

Test Tipi: Mobil Web Otomasyon Testi

📁 QueryCartMobilTest Proje Yapısı
Projenin dosya yapısı şu şekildedir:

arduino
Copy
Edit
QueryCartMobileTest/
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── config/          → Yapılandırma dosyaları
│   │       ├── drivers/         → WebDriver yöneticileri
│   │       ├── pagesApp/        → Mobil uygulama sayfa nesneleri
│   │       ├── pagesBrowser/    → Tarayıcı tabanlı test sayfaları
│   │       └── utilities/       → Yardımcı sınıflar (Driver, ConfigReader vb.)
│   ├── test/
│   │   └── java/
│   │       ├── stepdefinitions/ → Cucumber adım tanımları
│   │       └── runners/         → TestNG ve Cucumber runner'ları
├── resources/
│   ├── features/              → .feature dosyaları (senaryolar)
│   └── config.properties      → Test yapılandırma dosyaları
├── pom.xml                    → Maven bağımlılık dosyası
├── testng.xml                 → Alternatif test konfigürasyonu
├── logs/                      → Test günlükleri (.log dosyaları)
├── README.md                  → Proje açıklamaları ve kullanım rehberi
└── driversBrowser/            → Tarayıcı sürücüleri (örneğin: chromedriver.exe)
🧭 Uygulanan Test Kapsamı (Backlog)
Testler aşağıdaki kullanıcı hikayelerini kapsamaktadır (örnekler):

✅ US_001 - Kullanıcının ana sayfaya erişebilmesi

✅ US_007 - Kullanıcının kayıt olabilmesi

✅ US_008 - Kullanıcının giriş yapabilmesi

✅ US_012 - Ürün detaylarının görülebilmesi

✅ US_027 - Sepet işlemleri yönetimi

... ve 25'ten fazla kullanıcı hikayesi.

Detaylı backlog bilgisi için docs/backlog.md veya features/ klasörü incelenebilir.

📬 İletişim
Test Sahibi / QA Engineer: Oğuzhan Melih Güçlü

Mail: oguzhanmguclu@gmail.com

LinkedIn: Oğuzhan Melih Güçlü
