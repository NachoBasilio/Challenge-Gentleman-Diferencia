

// Detectar si podemos usar Service Workers
if ( navigator.serviceWorker ) {
    navigator.serviceWorker.register('/sw.js')
        .then(reg => {
        //     setTimeout(()=>{
        //         reg.sync.register('posteo-gatitos');
        //         console.log('SW registrado');
        //     },3000)
            Notification.requestPermission().then(result => {
                if ( result === 'granted' ) {
                    console.log('Permisos concedidos');
                }
                reg.showNotification("Hola Mundo, soy yo")
            })
        })

}



// fetch("https://reqres.in/api/users")
//     .then(resp => resp.json())
//     .then(console.log);

if ( window.SyncManager ) {
    console.log('Podemos usar SyncManager');

}