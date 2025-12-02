console.log('Service Worker is supported')

self.addEventListener('fetch', function(event) {


    // console.log(event.request.url)


    // if(event.request.url.includes('.jpg')) {

    //     let fotoReq = fetch(event.request.url)

    //     event.respondWith(fotoReq)
    // }


    // if ( event.request.url.includes('style.css') ) {

    //     let cssRes = new Response(`
    //         body {
    //             background-color: red; !important
    //             color: white;
    //         }
    //     `, { headers: {'Content-Type': 'text/css'} })

    //     event.respondWith(cssRes)
    // }

    // El service worker es muy poderoso, pero hay que tener cuidado con lo que se hace, ya que puede afectar la experiencia del usuario

    // if (event.request.url.includes('main.jpg')){
    //     event.respondWith(fetch('img/main-patas-arriba.jpg'))
    // }

    event.respondWith(
        fetch(event.request).then( res => {
            if (res.ok) {
                return res
            } else {
                return fetch('img/main-patas-arriba.jpg')
            }
        })
    )
})