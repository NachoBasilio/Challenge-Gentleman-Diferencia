let usuario = {
    nombre: "Nacho",
    edad: 26
}

fetch('https://reqres.in/api/users', {
    method: 'POST',
    body: JSON.stringify(usuario),
    headers: {
        'Content-Type': 'application/json'
    }
})
.then(res => {
    return res.json()
})
.then(data => {
    console.log(data)
})
