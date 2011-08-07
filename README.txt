Simple Person CRUD app
/ => redirect: /people

/people => list people
    <h1>Listing people</h1>

    <strong>Name</strong>
    - ... [Show] [Edit] [Destroy]

    [New Person]

/people/new => add person (GET, HTML edit interface)
    <h1>New person</h1>

    Name
    [edit box]

    [create person button]

    [Back]

/people => POST, add person and redirect (302) to /people/:id

/people/:id => GET, show person detail
    Person was successfully created. (*if new)

    Name: ${person.name}

    Edit | Back

/perons/:id/edit => edit person (GET)
    Editing person

    Name
    [edit box]

    [update person button]

    [Show] | [Back]

/people/:id => PUT, update person, and redirect to GET /people/:id

/people/:id => DELETE, remove person and redirect to /people

