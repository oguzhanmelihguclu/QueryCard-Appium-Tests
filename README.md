# 📱 QueryCart Mobil Test Otomasyon Projesi

Bu proje, [https://querycart.com/](https://querycart.com/) internet sitesine ait **mobil uygulamanın** Pixel 8 Pro cihazı üzerinde **Android 14.0** sürümü ile test edilmesi amacıyla hazırlanmıştır. Testler, **Cucumber** tabanlı yapı ile **Appium** framework'ü kullanılarak gerçekleştirilmiş olup, sonuçlar **Allure Reports** ile raporlanmıştır.

---

## 🚀 Teknolojiler ve Araçlar

| Araç / Teknoloji       | Açıklama                              |
|------------------------|----------------------------------------|
| Java (OpenJDK 23)      | Test senaryolarının yazım dili         |
| Cucumber               | BDD (Behavior Driven Development) yaklaşımı |
| Appium                 | Mobil uygulama otomasyon aracı         |
| Selenium WebDriver     | UI etkileşimleri (mobil tarayıcıda)    |
| TestNG                 | Test yönetimi                          |
| Allure                 | Raporlama aracı                        |
| Maven                  | Bağımlılık yönetimi ve proje yapılandırması |
| Android Emulator       | Pixel 8 Pro / Android 14.0             |

---

## 📱 Test Edilen Platform

- **Site:** [https://querycart.com/](https://querycart.com/)
- **Cihaz:** Pixel 8 Pro
- **Android Sürümü:** 14.0
- **Tarayıcı (mobil web testi):** Chrome / WebView
- **Test Tipi:** Mobil Web Otomasyon Testi

---

# QueryCartMobileTest Proje Yapısı


QueryCartMobileTest/ │ ├── src/ │ ├── main/ │ │ └── java/ │ │ ├── config/ → Yapılandırma dosyaları │ │ ├── drivers/ → WebDriver yöneticileri │ │ ├── pagesApp/ → Mobil uygulama sayfa nesneleri │ │ ├── pagesBrowser/ → Tarayıcı tabanlı test sayfaları │ │ ├── utilities/ → Driver, ConfigReader vb. yardımcı sınıflar │ │ │ ├── test/ │ │ ├── java/ │ │ │ ├── stepdefinitions/ → Cucumber adım tanımları │ │ │ ├── runners/ → TestNG ve Cucumber runner'ları │ │ │ │ │ ├── resources/ │ │ ├── features/ → .feature dosyaları (senaryolar) │ │ └── config.properties → Test yapılandırmaları │ ├── pom.xml → Maven bağımlılık dosyası ├── testng.xml → Alternatif test konfigürasyonu ├── logs/ → Test günlük kayıtları (.log dosyaları) ├── README.md → Proje hakkında açıklamalar ve kullanım rehberi └── driversBrowser/ → Tarayıcı sürücüleri (örn. chromedriver.exe)



🧭 Uygulanan Test Kapsamı (Backlog)
Testler aşağıdaki kullanıcı hikayelerini kapsamaktadır (örnekler):

✅ US_001 - Kullanıcının ana sayfaya erişebilmesi

✅ US_007 - Kullanıcının kayıt olabilmesi

✅ US_008 - Kullanıcının giriş yapabilmesi

✅ US_012 - Ürün detaylarının görülebilmesi

✅ US_027 - Sepet işlemleri yönetimi

… ve 25'ten fazla kullanıcı hikayesi

Detaylı backlog bilgisi için docs/backlog.md veya features/ klasörü incelenebilir.

📬 İletişim
Test sahibi / QA Engineer: Oğuzhan Melih Güçlü

Mail: oguzhanmguclu@gmail.com  
LinkedIn: https://www.linkedin.com/in/oguzhanmelihguclu/
