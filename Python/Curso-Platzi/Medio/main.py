# main.py - Todo el codigo en un archivo
"""
Sistema de analisis de noticias con API's multiples
"""

#PEP 8: Configuracion centrañisazada - constantes en MAYUSCULAS con guiones bajos

API_TIMEOUT = 30
MAX_RETRIES = 3
DEFAULT_LANGUAGE = 'es'

#PEP 8 Utilidades comunes del proyecto - funciones en snake_case

def clean_text(text):
    #PEP 8: 4 especios por indetacion, no tabs
    """Limpia el texto eliminando caracteres especiales y espacios extra."""
    if not text:
        return ""
    return text.strip().lower()