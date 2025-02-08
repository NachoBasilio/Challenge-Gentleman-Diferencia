let usuario = {
    nombre: "Nacho",
    edad: 26
}

fetch('http://reques.in/api/users', {
    method: 'POST',
    body: JSON.stringify(usuario),
    headers: {
        'Content-Type': 'application/json'
    }
})
.then(res=> res.json)
.then(console.log)
.catch(error => {
    console.error(error)
})
