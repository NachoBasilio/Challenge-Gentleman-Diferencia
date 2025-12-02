//Ciclo de vida

self.addEventListener('install', event => {
    //Descargamos assets
    // Creamos un cache
    console.log('SW: Instalado');

    const instalacion = new Promise((resolve, reject) => {

        setTimeout(() => {
            console.log('Instalaciones terminadas');
            //self.skipWaiting();//Forzar la activación del SW, a veces no se recomienda porque puede causar problemas.
            resolve()
        }, 1000)


    })


    event.waitUntil(instalacion) //Espera a que la promesa se resuelva
})


//Cuando el SW toma el control de la aplicación

self.addEventListener('activate', event => {
    //Borrar cache viejo
    console.log('SW: Activo y listo para controlar la app');

})


//Fetch: Manejo de peticiones HTTP (Descomentar desde linea 35)

// self.addEventListener('fetch', event => {

//     //Aplicar estrategias del cache
//     // console.log('SW:', event.request.url);

//     console.log(event.request.url)

//     //Imaginemos que necesitamos interceptar una petición a una API y devolver una respuesta personalizada, eso lo podemos hacer desde este evento.
//     if(event.request.url.includes('reqres.in')){

//         const resp = new Response(`{"ok": "false", "mensaje": "jajaja"}`)

//         event.respondWith(resp)
//     }
// })

//Sync: Recuperamos la conexión a internet

self.addEventListener('sync', event => {
    console.log('Tenemos conexión')
    console.log(event.tag)
})

//Push: Manejar las push notifications

self.addEventListener('push', event => {
    console.log('Notificación recibida')
    console.log(event)
})
