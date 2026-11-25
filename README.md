# Spring Boot Ders Örnekleri

Spring Boot eğitiminde yazılan üç örnek uygulama: Spring Data JPA ile ilk adımlar, Thymeleaf ve Bootstrap şablonlu bir portal, Spring Security ile giriş korumalı küçük bir sunucu yönetim paneli.

> **Not:** Bu depo 2017 yılında eğitim amaçlı yazıldı ve artık güncellenmiyor. Bağımlılıkları eskidir ve bilinen güvenlik açıkları içerir; üretimde kullanmayın.

## İçerik

| Klasör | Ne yapar |
|---|---|
| `Hello-Boot/` | İlk Spring Boot uygulaması: `/demo/add?name=...&email=...` ile kayıt ekleyen, `/demo/all` ile kayıtları JSON döndüren JPA örneği |
| `Spring-Boot-JPA-Bootstrap-Portal/` | Hazır bir Bootstrap temasının Thymeleaf şablonlarına çevrildiği portal; ana sayfa `/main/index.biznet` |
| `SpringSecurity/` | Spring Security ile form girişi ve rollü kullanıcılar, sunucu ekleme/listeleme ve iletişim sayfaları. Arayüz Start Bootstrap "Business Casual" temasıyla yapıldı |
| `SpringSecurity/src/main/java/dusukbagimililik/` | Sınıflar arası bağımlılık (coupling) konusu için küçük bir örnek |

## Teknolojiler

- Java 8
- Spring Boot 1.5.6 (Web, Data JPA, Thymeleaf, Security)
- MySQL (`mysql-connector-java`)
- Lombok, nekohtml (Thymeleaf `LEGACYHTML5` modu için), Gson
- Bootstrap, jQuery (statik dosya olarak projede)

## Çalıştırma

1. MySQL'de ilgili veritabanını oluşturun:
   - `Hello-Boot` → `db_example`
   - `Spring-Boot-JPA-Bootstrap-Portal` → `portal`
   - `SpringSecurity` → `sunucuyonetimi`
2. Her projenin `src/main/resources/application.properties` dosyasındaki veritabanı kullanıcı adı ve şifresini kendi ortamınıza göre değiştirin.
3. Proje klasöründe çalıştırın:

```
mvn spring-boot:run
```

Varsayılan portlar: `Hello-Boot` 8080, `Spring-Boot-JPA-Bootstrap-Portal` 8999, `SpringSecurity` 8090.

`SpringSecurity` projesindeki giriş kullanıcıları `WebSecurityConfig` sınıfında bellek içi (in-memory) olarak tanımlı örnek kullanıcılardır; kendi denemeniz için oradan değiştirin. `Hello-Boot` ve portal projelerinde `ddl-auto=create-drop` ayarlı olduğu için tablolar her açılışta yeniden oluşturulur.
