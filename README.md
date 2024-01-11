<a name="readme-top"></a>

<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://spring.io/" target="_blank" rel="noopener noreferrer">
    <img src="media/springlogo.png" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">Spring Demo Project</h3>
  
  <p align="center">
    A demo web app to display names from an SQL database, built with the Java Spring Framework and PostgreSQL.
    <br />
    <a href="https://github.com/KermWasTaken/javaspringdemo"><strong>Explore the docs »</strong></a>
  </p>
</div>

<!-- ABOUT THE PROJECT -->

## About The Project

![Web app screenshot][site-screenshot]

A Java Spring Framework web app demo project. 

From this project, I gained experience handling HTTP requests using an embedded Apache Tomcat servlet. Additionally, I learned how to integrate a PostgreSQL database in order to retrieve data and display it on an HTML document using a view model.

### Built With

- [![Spring][Spring-shield]][Spring-url]
- [![Thymeleaf][Thymeleaf-shield]][Thymeleaf-url]
- [![PostgreSQL][Postgres-shield]][Postgres-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- GETTING STARTED -->

## Getting Started

First, configure the postgreSQL server in application.properties:

```
spring.datasource.url= YOUR_POSTGRESQL_SERVER
spring.datasource.username= YOUR_POSTGRESQL_USERNAME
spring.datasource.password= YOUR_POSTGRESQL_PASSWORD
```

Then, build and run the web app using Apache Maven:

```bash
./mvnw spring-boot:run
```
Open [http://localhost:8080](http://localhost:8080) with your browser to see
the result.

You can fetch a user from the database using `/hello?user={id}`. The server response to the HTTP request with an HTML document saying hello to the selected user.

![Data fetch screenshot][data-screenshot]

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- CONTACT -->

## Contact

Zak Kermitz - zakkermitz@gmail.com

Portfolio Site: [https://kerm.dev](https://kerm.dev)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- ACKNOWLEDGMENTS -->

## Acknowledgments

- [Best-README-Template](https://github.com/othneildrew/Best-README-Template/blob/master/README.md)
- [Img Shields](https://shields.io)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->

[site-screenshot]: media/uiScreenshot.png
[data-screenshot]: media/dataScreenshot.png
[Spring-shield]: https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white
[Spring-url]: https://spring.io/
[Thymeleaf-shield]: https://img.shields.io/badge/Thymeleaf-%23005C0F.svg?style=for-the-badge&logo=Thymeleaf&logoColor=white
[Thymeleaf-url]: https://www.thymeleaf.org/
[Postgres-shield]: https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white
[Postgres-url]: https://www.postgresql.org/
