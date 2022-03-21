﻿# Техническое задание

# 1. Цель проекта

Цель проекта - разработать веб-приложение (веб-сайт), с помощью которого пользователи смогут создавать различные игры/задания (далее карты) для. Пользователю, создающему карты (далее учитель), будет доступно несколько макетов карт, по типу “выбери верный вариант ответа” или “соедени пары”, в которые он сможет добавлять условие задания и варианты ответов, отмечать правильные/неправильные варианты. Карты в свою очередь, можно добавлять в наборы карт, чтобы была возможность для долгих сессий выполнения карт без постоянного переключения. Для пользователя, который выполняет карты (далее ученик), в конце выполнения задания будет выводиться его персональный результат: процент прохождения и скорость решения. Помимо создания простых карт должна быть возможность автоматического создания кроссвордов, при котором от учителя требуется лишь добавить нужные слова, а сам кроссворд составится автоматически. 

# 2. Описание приложения

Приложение состоит из следующих функциональных блоков:

1. Регистрация, аутентификация и авторизация
2. Функционал для учителя
3. Функционал для ученика

## 2.1 Типы пользователей

В приложении предусмотрены два типа пользователей: учитель и ученик. Учитель создает карты, может делать их открытыми/закрытыми, то же самое с наборами карт, просматривает решения учеников. Ученик выбирает доступные ему карты, решает их, может просматривать свой результат, персональную статистику.  

## 2.2 Регистрация

Для регистрации пользователю нужно указать:

1. Имя и фамилию 
2. email
3. Пароль

## 2.3 Аутентификация учителя и ученика

В первоначальной версии приложения, сразу после аутентификации у пользователя будет запрошена роль: учитель или ученик. На основе его выбора, приложение будет показывать ему функционал, привязанный к выбранной роли.

Для пользователя должна быть реализована возможность восстановления забытого пароля. При запросе восстановления пароля необходимо на email пользователя прислать ссылку на восстановление пароля.  

## 2.4 Функционал для учителя

Учитель после аутентификации и выбора роли “Учитель” получает доступ к такому функционалу:

1. Просмотр созданных/общедоступных карт, наборов карт
2. Создание карт, их наборов
3. Редактирование готовых заданий: изменение содержимого, перенос из одной папки в другую, изменение статуса (открытое/закрытое)
4. Просмотр статистики учеников по прохождению созданных заданий
5. Распечатывание заданий, которые имеют тип “кроссворд”

> по каждому пункту можно расписать подробнее
> 

## 2.5 Функционал для ученика

Ученик после аутентификации и выбора роли “Ученик” получает доступ к такому функционалу:

1. Просмотр доступных, пройденных наборов карт
2. Просмотр информации о наборах карт
3. Просмотр собственной статистики выполнения заданий
4. Выполнение заданий

# Похожие приложения 

https://www.flexiquiz.com/
