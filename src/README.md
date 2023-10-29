# HOMEWORK   4
## First Question 
###### Unit Test Nedir?
- Unit test (Birim testi), bir uygulamanın test edilebilir en küçük biriminin test edilmesidir. Bu en küçük birim genellikle bir metod olurken bazen de bir metodun içindeki bir kod parçası olabilir.
###### Neden Unit Test yaparız?
- Unit testi kodumuzu yazmadan önce yazabiliriz. Böylelikle daha temiz ve kaliteli kod yazmamızı sağlar. Bunun yanın da birim testler, yazılımda olası hataları erken aşamada tespit edip, programda değişiklik yapmamızı kolaylaştırır ve güvenli bir şekilde kodu yeniden düzenlememizi sağlar.
###### Popular Unit Testing Frameworks
- JUnit 
- JBehave
- NUnit
- xUnit.NET
- Cypress
###### Unit Test İçin Uyulması Gereken Kurallar
- Yazılımın olabildiğince en küçük parçacığı test edilmelidir.
- Tek seferde sadece bir senaryo test edilmelidir.
- Test method ismi test edilen senaryonun yansıması olmalıdır.
- Test edilen metod diğer metodlardan bağımsız çalışabilmelidir.
- Testlerimiz tam otomatik şekilde çalışmalıdır.
- Hızlı çalışabilmeli ve çabuk sonuçlar vermelidir.
- Hızlı çalışabilmeli ve çabuk sonuçlar vermelidir.
- Okunaklı, anlaşılabilir ve sürdürebilir olmalıdır.
- Test başarısız olduğunda durmalı ve iyi bir hata raporu döndürmelidir. Bu hata raporunda neyi test ettin ? ne yapmalı ? beklenen çıktı neydi ve gerçekte ne yaptığıdır ?
## Second Question
###### Design Patterns Nedir ?
- Tasarım kalıpları, yazılım sektöründe karşılaşılan genel sorunları çözmek için geliştirilmiş tekrar kullanılabilir bir çözüm şablonu veya yaklaşımıdır.
Bu çözümler, uzun bir süre boyunca sayısız yazılım geliştirici tarafından deneme yanılma yoluyla elde edilmiştir. Daha sonra belli problemler için buldukları optimum çözümlere isimler vermişlerdir.
###### Design Patterns Tipleri ?
- Tasarım kalıpları 3 ana başlıkta incelenir bunlar :
- - Creational Design Patterns ( Yaratımsal Tasarım Kalıpları ) :  Nesnelerin oluşturulması ve yönetilmesi ile ilgili tasarım kalıplardır.
Örneğin Singleton, Factory Method, Abstract Factory, Builder.
- - Structural Patterns (Yapısal Desenler): Bu desenler, nesnelerin bir araya gelme şeklini ele alır. 
Örneğin, Adapter, Bridge, Composite, Decorator, Facade, Flyweight.
- -  Behavioral Patterns (Davranışsal Desenler): Birden fazla sınıfın bir işi yerine getirirken nasıl birlikte davranacağını belirleyen tasarım kalıplarıdır.
Örneğin, Observer, Strategy, Command, State, Visitor.