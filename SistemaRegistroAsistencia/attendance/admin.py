from django.contrib import admin
from .models import Asignatura, Periodo, Paralelo, Estudiante, Asistencia

admin.site.register(Asignatura)
admin.site.register(Periodo)
admin.site.register(Paralelo)
admin.site.register(Estudiante)
admin.site.register(Asistencia)
