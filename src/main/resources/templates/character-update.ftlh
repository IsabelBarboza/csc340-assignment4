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

        <section class="form">
            <h1>Update hero information: ${character.name}</h1>
            
            <form id="edit-character" action="/characters/update/${character.characterId}" method="post" enctype="multipart/form-data">
                <input type="text" id="name" name="name" value="${character.name}" placeholder="Name"><br><br>
                <input type="text" id="universe" name="universe" value="${character.universe}" placeholder="Universe"><br><br>
                <input type="text" id="role" name="role" value="${character.role}" placeholder="Role"><br><br>
                <input type="text" id="abilities" name="abilities" value="${character.abilities}" placeholder="Abilities"><br><br>

                <textarea name="description" placeholder="Description">${character.description}</textarea><br><br>
                <label for="picture" class="form-label"> Picture:</label>
                <input type="file" id="picture" name="picture" />
                <br><br>

                <button type="submit" class="btn btn-primary"> Save Changes </button>
            </form>

        </section>
</body>
</html>