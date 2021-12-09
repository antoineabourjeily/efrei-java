<img src="./Logo-Efrei-2017-Fr-Web.png" width="400">
<br/>

# LMS - Library Management System (Système de gestion des bibliothèques)

A Library Management System made using the concepts of Object Oriented Analysis and Design.

## General Instructions

This project should be developped using Java (console application) and MySQL.

### What you must use
  - Encapsulation
  - Method overloading/overriding
  - Inheritance
  - Interfaces
  - Polymorphisme
  - Packages
  - Input/Output (Scanner/System.out)
  - MySQL Server
  - MySQL Connector

### Resources you can use (including but not limited to)

  - The Internet (Google is your friend, stackoverflow, etc.)
  - Course and exercises

### Things you can't do

Copy an entire project from the internet. You can get inspired but it's easy to find from where did you copy the project.

## Submissions

You need to a form a group of maximum two people. The list of teams should be submitted before the **11/12/2021**. Check with your class representitive, he will be sending the list.

You have a bit more than 3 weeks to do this project which should be submitted by **03/01/2021 20h**.
The submission should contain the zipped project (.zip) and a small pdf report.

**All Submissions** must be sent to [wejden.abdallah@intervenants.efrei.net](mailto:wejden.abdallah@intervenants.efrei.net) CC [antoine.abou-rjeily@intervenants.efrei.net](mailto:antoine.abou-rjeily@intervenants.efrei.net).

Any Project submitted after that due date is going to be discarded and the team wouldn't be able to defend their project in front of the jury.

## Presentation

The presentation will be held on the 4th of January 2022. The schedule will be sent to each team in a later date.

Each team will have to present their project and should talk equally during the presentation and should be able to answer any and all the questions that the jury deems appropriate.

An individual task would be given for each student and would consist of 30% of their final grade.

The code, the presentation and the question would consist the other 70%.

# Business Requirements

## Interface

These are some exemples of how you could structure your interface. Feel free to do this however you like.  
<br/>

---
**_&#9888; TIP_**

Don't forget to use switch/case and enums to create your interface workflows. It makes your code a lot more readable and easier to maintain! 

---
<br/>
<br/>
<div style="display:flex; flex-grow:0; gap: 20px; align-Books: center">
   <img src="./interface.PNG" width="400" height="290"/>
   <img src="./interface2.PNG" width="400"/>
</div>

## Actors:

The actors include the following:

- Clerk
- Librarian
- Borrower
- Administrator

## Use Cases:

After determining the actors, the second step in use case analysis is to determine the tasks that each actor will need to do with the system. Each task is called a use case because it represents one particular way the system will be used.

**In other words, only those use cases are listed that actors will need to do when they are using the system to solve the customer’s problem.**

### Borrower:

- ❏ Search for Books by title, by author or by subject
- ❏ Check personal information
- ❏ List currently borrowed books

### Checkout Clerk:

- ❏ All the Borrower use cases, plus
- ❏ Check out a Book for a borrower
- ❏ Check the borrower's age to see if the book's genre is appropriate
- ❏ Check in a Book that has been returned
- ❏ Add a new borrower
- ❏ Update a borrower’s personal information (address, telephone number etc.)

### Librarian:

- ❏ All of the Borrower and Checkout Clerk use cases, plus
- ❏ Add a new Book to the collection
- ❏ Delete a Book from the collection
- ❏ Change the information about a Book

### Administrator:

- ❏ Add Clerk
- ❏ Add Librarian
- ❏ View Issued Books History
- ❏ View All Books in Library


## DB

You can find the db schema in the file `db_schema.sql`

<br/>
<br/>
<img src="./good-luck.jpeg" width="400"/>