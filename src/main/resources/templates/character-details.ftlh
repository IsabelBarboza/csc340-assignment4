<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>${title}</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
  <link rel="stylesheet" href="/styles.css">
</head>

<body>
        <nav>
            <a href="/characters/about">About</a>
            <a href="/characters/all">Home</a>
            <a href="/characters/add">Add Character</a>
        </nav>
        <div class="card" style="width: 50rem;">
            <div class="card-details">
            
                <img src="/image/${(character.characterPicturePath)!'1.jpg'}" alt="${character.name}">
                
                <div class="card-body">
                    <h3>${character.name}</h3>
                    <p> <strong>Universe:</strong> ${character.universe} </p>
                    <p> <strong> Role:</strong> ${character.role} </p>
                    <p> <strong> Abilities:</strong> ${character.abilities} </p>
                    <p> <strong>Description:</strong> ${character.description} </p>
                </div>

                <a href="/characters/update/${character.characterId?c}" class="btn btn-primary">Edit</a>
                
                <a href="/characters/delete/${character.characterId?c}" class="btn btn-danger" >Delete</a>
            </div>
        </div>
           
    </body>
</html>