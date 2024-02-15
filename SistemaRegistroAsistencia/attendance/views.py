from django.shortcuts import render, redirect
from datetime import datetime
from .models import Attendance
from .forms import AttendanceForm

def register_attendance(request):
    if request.method == 'POST':
        form = AttendanceForm(request.POST)
        if form.is_valid():
            form.save()
            return redirect('attendance_list')  # Redirigir a la lista de asistencias
    else:
        form = AttendanceForm()
    return render(request, 'attendance/register_attendance.html', {'form': form})