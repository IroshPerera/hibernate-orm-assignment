#Hibernate ORM Assignment

This assignment focuses on using Hibernate for performing CRUD operations on a single entity (Book) and managing relationships between entities (Book and Author). The project is developed using Java JDK 11.0.16, MySQL 8.0.32, and Hibernate Core 6.2.6.Final.

##Part 1: CRUD Operations on a Single Entity (Book)

###Description
In this part of the assignment, you will implement CRUD (Create, Read, Update, Delete) operations for the Book entity. The application allows you to create new books, retrieve books by their ID, update existing book attributes, and delete books from the database.

###Instructions

Set up the Project:

**🖋** Ensure you have Java JDK 11.0.16 installed.

**🖋** Clone this repository to your local machine.

Configure MySQL Database:

**🖋** Make sure you have MySQL 8.0.32 installed and running.

**🖋** Create a new database/schema for this application.

**🖋** The application will perform CRUD operations on the Book entity and display the results in the console.


##Part 2: Relationships between Entities (Book and Author)

###Description
In this part of the assignment, you will work with two entities: Book and Author. You will implement one-to-one, one-to-many, and many-to-many relationships between these entities using Hibernate annotations.

###Instructions

Set up the Project:

**🖋** Ensure you have Java JDK 11.0.16 installed.

**🖋** Clone this repository to your local machine.

Configure MySQL Database:

**🖋** Make sure you have MySQL 8.0.32 installed and running.

**🖋** Create a new database/schema for this application.

**🖋** The application will demonstrate one-to-one, one-to-many, and many-to-many relationships between Book and Author entities and display the results in the console.

##Important Notes

**🖋** Make sure to have the correct MySQL JDBC driver in your classpath or Maven dependencies.

**🖋** Verify that your MySQL server is running, and the database/schema is created.

**🖋** Handle exceptions and error cases appropriately in the application.

**🖋** Properly close the Hibernate Session or EntityManager and database resources after each operation.

**🖋** Before submission, thoroughly test the application to ensure all CRUD operations and entity relationships are working correctly.