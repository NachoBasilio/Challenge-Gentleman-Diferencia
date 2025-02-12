fetch("https://reqres.in/api/users")
    .then(resp => {
            resp.clone().json()
                .then(usuario=>{
                    console.log(usuario)
                })

            resp.clone().json()
                .then(usuario=>{
                    console.log(usuario)
                })

            resp.json()
                .then(usuario=>{
                    console.log(usuario)
                })
        }
    )
