from django import forms
from .models import Attendance

class AttendanceForm(forms.ModelForm):
    class Meta:
        model = Attendance

        fields = ['date', 'ciclo', 'paralelo', 'asignatura', 'hora', 'student_name', 'present']