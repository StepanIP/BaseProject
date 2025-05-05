# 🎬 Cinema Ticket Booking System

RELEASE

Java мікросервісний додаток для онлайн-бронювання квитків у кінотеатр. Система дозволяє користувачам переглядати розклад сеансів, обирати фільми, бронювати місця та залишати відгуки.

## 🧩 Архітектура

Система реалізована як набір мікросервісів із використанням таких технологій:

- **Java 17** (основна мова розробки)
- **Spring Boot** (створення REST API)
- **Spring Data JPA** (робота з базою даних)
- **MySQL** (реляційна база даних)
- **Docker** (контейнеризація)
- **Kafka** (обробка подій, якщо використовується)
- **Redis** (кешування)
- **AWS S3** (зберігання зображень)
- **Traefik / Eureka / Gateway** (сервісна маршрутизація, якщо присутня)

## 📁 Структура проєкту

Мікросервіси:


- `movie-service` — керування фільмами, категоріями, режисерами, акторами.
- `saloon-service` — керування кінотеатрами, залами та сеансами.
- `booking-service` — логіка бронювання місць та квитків.
- `user-service` — аутентифікація та профілі користувачів.
- `comment-service` — відгуки на фільми.
- `notification-service` — (опціонально) надсилання сповіщень на email/SMS.

## 🗃️ База даних

У системі використовується SQL-структура з таблицями:

- `movie`, `category`, `director`, `actor`, `movie_actor`
- `movie_image`, `actor_image`
- `city`, `saloon`, `movie_saloon_time`
- `comment`, `booking`, `user`, `seat`

## 🚀 Запуск локально

1. Клонуйте репозиторій:

   ```bash
   git clone https://github.com/your-username/cinema-booking-system.git
   cd cinema-booking-system
