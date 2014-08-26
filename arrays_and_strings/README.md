Topic 1 - Arrays and Strings
=============================

Topic tasks:
<ol>
<li>Реализуйте алгоритм, определяющий все ли символы в строке встречаются один раз. При выполнении этого задания нельзя использовать дополнительные структуры данных.</li>
<li>Реализуйте функцию <code>void reverse(char* str)</code> на С или С++. Функция должна циклически сдвигать строку, заканчивающуюся символом <code>null</code></li>
<li>Для двух строк напишите метод, определяющий, является ли одна строка перестановкой другой.</li>
<li>Напишите метод, заменяющий все пробелы в строки символами '%20'. Можно предположить, что длина строки позволяет сохранить дополнительные символы и "истинная" длина строки известна. (Примечание: при реализации метода на Java используйте символьный массив.)
<br><i>Пример</i>:<br/>
<code>Ввод: "Mr John Smith"<br/>
Вывод: "Mr%20John%20Smith"</code></li>
<li>Реализуйте метод, осуществляющий сжатие строки, на основе счетчика повторяющихся символов. Например, строка <code>aabcccccaaa</code> должна превратиться в <code>a2b1c5a3</code>. Если "сжатая" строка оказывается длиннее исходной, метод должен вернуть исходную строку.</li>
<li>Дано: изображение в виде матрицы размером <code>N x N</code>, где каждый пиксель занимает <code>4</code> байта. Напишите метод, поворачивающий изображение на <code>90&deg;</code>.</li>
<li>Напишите алгоритм, реализующий следующее условие: если элемент матрицы в точке <code>M x N</code> равен <code>0</code>, то есть столбец и вся строка обнуляются.</li>
<li>Допустим, что существует метод <code>isSubstring</code>, проверяющий, является ли одно слово подстрокой другого. Для двух строк, <code>s1</code> и <code>s2</code>, напишите код проверки, получена ли строка <code>s2</code> циклическим сдвигом <code>s1</code>, используя только один вызов метода <code>isSubstring</code> (пример: слово <code>waterbottle</code> получено циклическим сдвигом <code>erbottlewat</code></li>
</ol>