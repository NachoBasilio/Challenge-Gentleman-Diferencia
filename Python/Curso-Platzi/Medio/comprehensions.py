# Apuntes sobre dudas del curso:
# - clean_text: Función en main.py para limpiar texto (strip y lower). No es estándar, solo disponible en su módulo (importar para usar en otros archivos).
# - Sets: Colección de elementos únicos (conjunto en español). Se define con set() o {} sin key:value en comprensiones.
# - Comprensiones: [lista], {diccionario con key:value}, {set sin :}.
# - Funciones tradicionales vs comprensiones: Ambas válidas; comprensiones son más concisas.

sample_articles = [
    {'title': 'Python logra nuevo éxito', 'source': {'name': 'TechNews'}, 'description': 'Gran noticia', 'category': 'Tecnología'},
    {'title': 'Mercado en crisis', 'source': {'name': 'Finance'}, 'description': 'Análisis completo', 'category': 'Economía'},
    {'title': 'Nueva tecnología', 'source': {'name': 'TechNews'}, 'description': 'Innovación', 'category': 'Tecnología'},
    {'title': 'Deportes hoy', 'source': {'name': 'Sports'}, 'description': 'Resultados', 'category': 'Deportes'},
    {'title': 'Política actual', 'source': {'name': 'News'}, 'description': 'Actualidad', 'category': 'Política'},
    {'title': 'Ciencia avanza', 'source': {'name': 'Science'}, 'description': 'Descubrimientos', 'category': 'Ciencia'}
]

def extract_titles_traditional(articles):
    """Extrae solo los titulos"""
    title = []
    for article in articles:
        title.append(article["title"])
    return title

print(extract_titles_traditional(sample_articles))

def extract_titles(articles):
    """Extrae solo los titulos usando comprehension"""

    return [
        article["title"] for article in articles if len(article["title"]) > 20
    ]

print(extract_titles(sample_articles))

def extract_article_summaries(articles):
    return {
        article["title"]: article["description"]
        for article in articles
    }

print(extract_article_summaries(sample_articles))

def extract_sources_traditional(articles):
    sources = set()
    for article in articles:
        sources.add(article["source"]["name"])
    return sources

print(extract_sources_traditional(sample_articles))

def extract_sources(articles):
    return {article["source"]["name"] for article in articles}

print(extract_sources(sample_articles))
