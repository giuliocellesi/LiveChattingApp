#Live Chatting App

This is a simple chat application that enables online users to communicate in real-time. The backend is developed using Spring Boot, the frontend with JavaScript, and Mongo as DataBase. The choice of a NoSQL database is to enhance the retrieval of stored messages, while user images are stored in the filesystem to improve overall efficiency. Docker-compose is utilized to manage MongoDB and mongo-express, eliminating the need for local installations.

##Next Steps

These enhancements aim to simulate a real-world app, promising a more robust, scalable, and efficient user experience.

###User Management

The next phase involves enhancing user management features, including login, logout, and implementing a password change mechanism with email notifications through SMTP. To achieve this, the plan is to transition from a NoSQL database to a SQL database, as it aligns better with user-related data storage requirements.

###Microservices Architecture

To further modularize the application, it is proposed to split it into two microservices:
####Profiler Microservice (profiler-ms)

This microservice will handle user-related functionalities such as login, logout, and password management. Shifting to a SQL database for this microservice aligns with the relational nature of user data.
####Messaging Microservice (messaging-ms)

The messaging microservice will be dedicated to handling chat functionalities. Utilizing this separate microservice ensures a focused and scalable approach to messaging features. The communication between the profiler-ms and messaging-ms will be facilitated through a message queue, specifically using ActiveMQ.
