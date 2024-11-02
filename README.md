<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>Hibernate Association Mappings</h1>
    <p>This repository demonstrates different types of Hibernate association mappings in Java using annotations. Each association type is covered with examples and code snippets.</p>

    <h2>Association Types</h2>

    <h3>1. @ManyToMany Association</h3>
    <p>The <code>@ManyToMany</code> association is used when each entity can be associated with multiple instances of the other entity. A join table is required to manage the relationship between the two entities.</p>
    <p><strong>Example:</strong> A <code>People</code> entity can be associated with multiple <code>Projects</code> and vice versa.</p>

    <h3>2. @ManyToOne Association</h3>
    <p>The <code>@ManyToOne</code> association is used when multiple instances of one entity are associated with a single instance of another entity. It represents a many-to-one relationship.</p>
    <p><strong>Example:</strong> Many <code>Books</code> belong to one <code>Library</code>.</p>

    <h3>3. @OneToMany Association</h3>
    <p>The <code>@OneToMany</code> association is used when one entity is associated with multiple instances of another entity. This is typically the inverse side of a <code>@ManyToOne</code> relationship.</p>
    <p><strong>Example:</strong> One <code>Department</code> can have multiple <code>Employees</code>.</p>

    <h3>4. @OneToOne Association</h3>
    <p>The <code>@OneToOne</code> association is used when each instance of one entity is associated with a single instance of another entity.</p>
    <p><strong>Example:</strong> A <code>Student</code> can have one <code>Laptop</code>.</p>

    <h2>Getting Started</h2>
    <ol>
        <li>Clone the repository.</li>
        <li>Import the project into your preferred IDE.</li>
        <li>Configure the <code>application.properties</code> file with your database settings.</li>
        <li>Run the application to see the association mappings in action.</li>
    </ol>

    <h2>Technologies Used</h2>
    <ul>
        <li>Hibernate ORM</li>
        <li>JPA Annotations</li>
        <li>Java 8+</li>
        <li>MySQL (or any relational database)</li>
    </ul>

</body>
</html>
