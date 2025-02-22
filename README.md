# 3.5. Потоки данных. Работа с файлами

> Привет! На связи домашнее задание урока 3.5. Потоки данных. Работа с файлами.

На прошлом уроке мы углубились в изучение SQL-запросов: попрактиковались с SELECT-запросами, а также настроили связи OneToMany и ManyToOne.

Цель сегодняшнего домашнего задания — научиться работать с файлами (загружать их и отдавать в запросах) и со связями OneToOne.

*Среднее время выполнения: 120 минут.*
> 

**Шаг 1**

Создать модель Avatar. В ней будем хранить аватарки студентов. В модель добавить следующие поля: Long id, String filePath, long fileSize, String mediaType, byte[] data, Student student.

<aside>

</aside>

**Шаг 2**

Настроить связь OneToOne между моделями Student и Avatar. Для этого к полю student в модели Avatar добавить аннотацию @OneToOne. Добавить контроллер, сервис и репозиторий для работы с моделью Avatar.

<aside>

</aside>

**Шаг 3**

Добавить три эндпоинта. Первый для загрузки картинки. При загрузке должно происходить сохранение данных как в БД, так и на локальный диск. Второй эндпоинт должен возвращать картинку из БД. Третий должен возвращать картинку из директории.

<aside>

</aside>
