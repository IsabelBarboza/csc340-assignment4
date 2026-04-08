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

        <header> 
            <h1> Dota 2 Heroes</h1>
        </header>

        <div class="welcome-text">
             <p>Welcome to the Dota 2 Heroes list! Discover the diverse roster of heroes from the popular game Dota 2. Each hero has unique abilities and playstyles, making them suitable for different strategies and team compositions.</p>
                <p>Click on view details to learn about their skills and attributes. Use the search bar to find your favorite hero by name or role.</p>
        </div>

        <div class="search-container">
            <form action="/characters/search" method="get">
                <input type="text" id="search-name" name="name" placeholder="Search by name">
                <button type="submit">Go</button>
            </form>

            <form action="/characters/search/role" method="get">
                <input type="text" id="search-role" name="role" placeholder="Search by role">
                <button type="submit">Go</button>
            </form>
        </div>


        
        <div class="row" id="charactersGrid">  
            <#list characterList as character>
                <div class="card" style="width: 18rem;">
                    <img src="/image/${(character.characterPicturePath)!'1.jpg'}" class="card-img-top" alt="Character Picture">
                    <div class="card-body">

                        <h3>${character.name}</h3>
                        <h2>Role: ${character.role}</h2>
                        <p>Universe: ${character.universe}</p>

                        <a href="/characters/${character.characterId?c}" class="btn btn-primary">View Details</a>
                    </div>
                </div>
            </#list>
        </div>

</body>    
</html>