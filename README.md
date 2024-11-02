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

    <pre>
@Entity
public class People {
    @Id
    private int people_id;
    private String people_name;

    @ManyToMany
    @JoinTable(
        name = "People_Project",
        joinColumns = { @JoinColumn(name = "people_id") },
        inverseJoinColumns = { @JoinColumn(name = "project_id") }
    )
    private List<Projects> projects = new ArrayList<>();
}

@Entity
public class Projects {
    @Id
    private int project_id;
    private String project_name;

    @ManyToMany(mappedBy = "projects")
    private List<People> people = new ArrayList<>();
}
    </pre>

    <h3>2. @ManyToOne Association</h3>
    <p>The <code>@ManyToOne</code> association is used when multiple instances of one entity are associated with a single instance of another entity. It represents a many-to-one relationship.</p>
    <p><strong>Example:</strong> Many <code>Books</code> belong to one <code>Library</code>.</p>

    <pre>
@Entity
public class Books {
    @Id
    private int book_id;
    private String book_name;

    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;
}

@Entity
public class Library {
    @Id
    private int library_id;
    private String lib_name;

    @OneToMany(mappedBy = "library")
    private List&lt;Books&gt; books = new ArrayList<>();
}
    </pre>

    <h3>3. @OneToMany Association</h3>
    <p>The <code>@OneToMany</code> association is used when one entity is associated with multiple instances of another entity. This is typically the inverse side of a <code>@ManyToOne</code> relationship.</p>
    <p><strong>Example:</strong> One <code>Department</code> can have multiple <code>Employees</code>.</p>

    <pre>
@Entity
public class Department {
    @Id
    private int dept_id;
    private String dept_name;

    @OneToMany(mappedBy="dept")
    private List&lt;Employee&gt; emp;
}

@Entity
public class Employee {
    @Id
    private int emp_id;
    private String emp_name;

    @ManyToOne
    @JoinColumn(name="Dept")
    private Department dept;
}
    </pre>

    <h3>4. @OneToOne Association</h3>
    <p>The <code>@OneToOne</code> association is used when each instance of one entity is associated with a single instance of another entity.</p>
    <p><strong>Example:</strong> A <code>Student</code> can have one <code>Laptop</code>.</p>

    <pre>
@Entity
public class Laptop {
    @Id
    private int l_id;
    private String l_name;

    @OneToOne
    private Student student;
}

@Entity
public class Student { 
    @Id
    private int student_id;
    private String student_name;

    @OneToOne
    private Laptop laptop;
}
    </pre>

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

    <h2>License</h2>
    <p>This project is licensed under the MIT License.</p>
</body>
</html>
