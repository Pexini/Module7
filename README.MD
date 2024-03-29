<h2> Модуль 7. Объектно-ориентированный подход. Практика </h2>

<h3> Вопросы:  </h3> 
<h5> 1. Дайте определения понятиям: парадигма в программировании, объектно-ориентированный подход, класс, поле, метод, конструктор. </h5>
<ol>
<li> Парадигма в программировании - Это совокупность идей, принципов и понятий, которые определяют стиль написания программ. (Парадигма определяет, по каким правилам будет написана программа. Но парадигма не определяет то, что будет внутри программы) </li>
<li> Объектно-ориентированный подход - Заключается в том, что мы представляем всю нашу программу в виде объектов, которые взаимодействуют друг с другом.  </li>
<li> Класс - Это модель для создания объектов определённого типа, описывающая их структуру (набор полей и их начальное состояние) и определяющая алгоритмы (функции или методы) для работы с этими объектами.   </li>
<li> Поле - Описывают состояние объекта.</li>
<li> Метод - Описывает поведение объекта. То, как с ним можно взаимодействовать.</li>
<li> Конструктор - Позволяет создать объект класса и задать начальное состояние этого объекта.</li>
</ol>

<h5> 2. Что такое перегрузка конструктора?: </h5>
<ol> Класс в Java может иметь сколько угодно конструкторов, и это называется "перегрузка конструкторов". Перегрузка конструкторов позволяет определить различные способы инициализации объектов, предоставляя различные варианты параметров для конструктора. <br> Когда мы создаем несколько конструкторов в классе, они должны иметь уникальные списки параметров. Перегруженные конструкторы различаются по типу, количеству или порядку параметров.</ol>

<h5> 3. Что такое перегрузка методов?: </h5>
<ol> Когда название одинаковое, но разный набор входных параметров называется перегрузкой методов. Перегрузка методов используется, когда мы ожидаем одно и то же поведение от объекта, но при этом необходимо передать разный набор параметров. </ol>

<h5> 4. Для чего нужны модификаторы доступа?: </h5>
<ol> Модификатор доступа определяет, кто может менять поля, вызывать методы и пользоваться конструкторами. <br>
<h6> Они бывают: </h6>
<li>public: Элементы с модификатором public доступны из любой части программы.</li>
<li>protected: Элементы с модификатором protected доступны внутри пакета, а также в подклассах (даже если они находятся в других пакетах).</li>
<li>default (package-private): Если элемент класса не имеет модификатора доступа (нет явного указания на public, protected или private), то он доступен только внутри текущего пакета.</li>
<li>private: Элементы с модификатором private доступны только внутри своего собственного класса и не доступны извне.</li>
</ol>

<h5> 5. Для чего нужен модификатор static? Приведите примеры, где могут использоваться статические поля, классы, методы: </h5>
<ol>Статические методы необходимы для создания утилитарных наборов инструкций. Эти инструкции никак не должны зависеть от состояния объекта, которому они принадлежат. Они выполняют операции только на основе переданных в них параметров. 
<h6> Примеры</h6>
<li>Статические поля (переменные): Используются для хранения общих данных для всех экземпляров класса. Пример: </li>
<br>
<strong> public class Counter {
    public static int count = 0; 
} </strong> <br>
в коде:<br>
<strong> Counter.count++;</strong>
<br>
<br>
<li> Статические методы: Используются для выполнения действий, не зависящих от конкретного экземпляра класса. Обычно используются для утилитарных операций. Пример:</li>
<br>
<strong> public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
}</strong> <br>
в коде:<br>
<strong> int result = MathUtils.add(5, 3);</strong><br>
<br>

<li>Статические классы: Используются для группировки связанных статических методов или констант. Пример: </li>
<br>
<strong> public class Constants {<br>
    public static final double PI = 3.14159;<br>
    public static final double SPEED_OF_LIGHT = 299792458;<br>
} </strong>
</ol>

<h5> 6. В чем разница между статическим и нестатическим вложенными классами?: </h5>
<ol> 
<li>Статические классы - объявляются с ключевым словом static и, таким образом, не имеют доступа к нестатическим членам внешнего класса.</li>
<li>Статические вложенные классы могут быть созданы независимо от создания экземпляра внешнего класса.</li>
<li>Статические классы используются, когда внутренний класс не нуждается в доступе к нестатическим членам внешнего класса и может существовать самостоятельно. Например, статические классы-утилиты или константы.</li>
</ol>