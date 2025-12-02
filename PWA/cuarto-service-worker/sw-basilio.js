self.addEventListener('fetch', event => {

    // const offlineResponse = () => {
    //     return new Response(`
    //     <!DOCTYPE html>
    //     <html lang="es">
    //     <head>
    //         <meta charset="UTF-8">
    //         <meta name="viewport" content="width=device-width, initial-scale=1.0">
    //         <meta http-equiv="X-UA-Compatible" content="ie=edge">
    //         <title>Mi PWA</title>
    //         <style>
    //             body {
    //                 font-family: Arial, sans-serif;
    //                 text-align: center;
    //                 padding: 20px;
    //             }
    //         </style>
    //     </head>
    //     <body>
    //         <h1>Offline Mode</h1>
    //         <p>Estás en modo offline</p>
    //     </body>
    //     </html>
    //     `, {
    //         headers: { 'Content-Type': 'text/html' }
    //     });
    // };

    const offlineResponse = fetch('/pages/offline.html')

    const resp = fetch(event.request).catch(offlineResponse)

    event.respondWith(resp);
});
