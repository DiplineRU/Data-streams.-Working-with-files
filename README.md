ru text
# 3.5. Потоки данных. Работа с файлами

> Привет! На связи домашнее задание урока 3.5. Потоки данных. Работа с файлами.

На прошлом уроке мы углубились в изучение SQL-запросов: попрактиковались с SELECT-запросами, а также настроили связи OneToMany и ManyToOne.

Цель сегодняшнего домашнего задания — научиться работать с файлами (загружать их и отдавать в запросах) и со связями OneToOne.

*Среднее время выполнения: 120 минут.*
> 

**Шаг 1**

Создать модель Avatar. В ней будем хранить аватарки студентов. В модель добавить следующие поля: 
  - Long id,
  - String filePath,
  - long fileSize,
  - String mediaType,
  - byte[] data,
  - Student student.

<aside>

</aside>

**Шаг 2**

Настроить связь OneToOne между моделями Student и Avatar. Для этого к полю student в модели Avatar добавить аннотацию @OneToOne. Добавить контроллер, сервис и репозиторий для работы с моделью Avatar.

<aside>

</aside>

**Шаг 3**

Добавить три эндпоинта. 
  - Первый для загрузки картинки. При загрузке должно происходить сохранение данных как в БД, так и на локальный диск. 
  - Второй эндпоинт должен возвращать картинку из БД.
  - Третий должен возвращать картинку из директории.

<aside>

</aside>

eng text
# 3.5. Data flows. Working with files

> Hello! In touch with the homework of lesson 3.5. Data flows. Working with files.

In the last lesson, we delved into the study of SQL queries: we practiced with SELECT queries, and also set up connections between OneToMany and ManyToOne.

The purpose of today's homework is to learn how to work with files (upload them and send them in requests) and with OneToOne connections.

*Average execution time: 120 minutes.*
> 

**Step 1**

Create an Avatar model. We will store student avatars in it. Add the following fields to the model:
- Long id,
- String filePath,
- long fileSize,
- String mediaType,
- byte[] data,
- Student student.

<aside>

</aside>

**Step 2**

Set up the OneToOne connection between the Student and Avatar models. To do this, add the @OneToOne annotation to the student field in the Avatar model. Add a controller, service, and repository to work with the Avatar model.

<aside>

</aside>

**Step 3**

Add three endpoints. 
  - The first one to upload an image. When downloading, data must be saved both to the database and to the local disk. 
  - The second endpoint should return a picture from the database.
  - The third one should return the image from the directory.

<aside>

</aside>
