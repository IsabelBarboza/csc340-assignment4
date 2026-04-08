<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>${title}</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
  <link rel="stylesheet" href="/styles.css">
</head>

<body >
    <nav>
            <a href="/characters/about">About</a>
            <a href="/characters/all">Home</a>
            <a href="/characters/add">Add Character</a>
    </nav>

    <section class="error">
        <h1>Oops!</h1>
        <p>Sorry, the page you are looking for does not exist.</p>
        

        <#if errorMessage??>
            <p>${errorMessage}</p>
            <#else>
            <p>Somenthing went wrong.</p>
        </#if>

        <a href="/characters/all">Go back to Home</a>
    </section>

</body>

</html>