

if ( navigator.serviceWorker ) {
    navigator.serviceWorker.register('/sw.js');
}

// if(window.caches){
//     caches.open('prueba-1')

//     caches.has('prueba-1')
//     .then(console.log)

//     caches.delete('prueba-1')
//     .then(console.log)


//     caches.open('cache-v1-1')
//         .then(cache => {
//             cache.add('/index.html')

//             cache.addAll([
//                 '/index.html',
//                 '/css/style.css',
//                 '/img/main.jpg'
//             ])
//             .then(() => {
//                 // cache.delete('/css/style.css')

//                 cache.put('index.html', new Response('Hola Mundo'))

//             })


//             // cache.match('/index.html')
//             //     .then(res => {
//             //         res.text().then(console.log)
//             //     })
//         })

//     caches.keys()
//         .then(console.log)
// }