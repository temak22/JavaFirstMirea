# Вывод в формате .md по результатам тестирования в задании 30

---------------------------

JUnit отличный инструмент для тестирования своего кода. Ещё лучше JUnit сработает в связке с Maven: при сборке проекта Maven обязательно проведет все тесты, и потом соберет готовый проект. При этом, если тесты будут провалены, проект собран не будет, а мы будем знать причины. Так будет намного легче разобраться, где именно поломка, чем проходиться по всему коду. С ростом проекта важность системы автоматического тестирования только возрастает.

В данном случае, все тесты прошли успешно, что означает, что методы, реализованные в тестируемом классе Client, работаю правильно.

Если хорошо покрыть тестами код, можно быть увереным, что у клиента наш продукт будет работать без проблем.