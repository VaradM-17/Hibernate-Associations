<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<h1>Hibernate Association Mappings</h1>

<p>This project demonstrates different types of Hibernate association mappings in Java using annotations. Each association type is explained with examples of how it’s typically used in applications.</p>

<h2>Association Types</h2>

<h3>1. @ManyToMany Association</h3>
<p>The <code>@ManyToMany</code> association allows each entity instance to be associated with multiple instances of another entity, and vice versa. This type of association requires a join table to manage the relationship.</p>

<h3>2. @ManyToOne Association</h3>
<p>The <code>@ManyToOne</code> association represents a many-to-one relationship, where multiple instances of one entity are associated with a single instance of another entity. This setup is common in cases like multiple books belonging to one library.</p>

<h3>3. @OneToMany Association</h3>
<p>The <code>@OneToMany</code> association allows a single entity instance to be related to multiple instances of another entity. It’s often used as the inverse of a <code>@ManyToOne</code> relationship, such as one department having multiple employees.</p>

<h3>4. @OneToOne Association</h3>
<p>The <code>@OneToOne</code> association maps each instance of one entity to a single instance of another entity. This is used in cases where each entity instance has a unique corresponding instance, like a student having one laptop.</p>

<h2>Technologies Used</h2>
<ul>
    <li>Java</li>
    <li>Hibernate ORM</li>
    <li>JPA Annotations</li>
    <li>MySQL (or any relational database)</li>
</ul>

<h2>Installation</h2>
<pre><code>git clone https://github.com/yourusername/hibernate-associations.git
cd hibernate-associations
// Configure your database settings in hibernate.cfg.xml
</code></pre>

<h2>Configuration</h2>
<p>Update the <code>hibernate.cfg.xml</code> file with your database connection details. Ensure your database schema matches the associations defined in the entities.</p>

<h2>How to Run</h2>
<pre><code>javac -cp ".:lib/*" com/controller/AssociationDemoController.java
java -cp ".:lib/*" com.controller.AssociationDemoController
</code></pre>

<h2>Usage</h2>
<p>Run the application to see different types of association mappings in action. The console menu will guide you to interact with the entities and view their relationships.</p>

<h2>License</h2>
<p>This project is licensed under the MIT License.</p>

</body>
</html>
