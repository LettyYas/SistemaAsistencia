# Generated by Django 5.0.2 on 2024-02-15 18:03

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('attendance', '0002_asignatura_asistencia_estudiante_paralelo_periodo_and_more'),
    ]

    operations = [
        migrations.CreateModel(
            name='Ciclo',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('nombre', models.CharField(max_length=100)),
            ],
        ),
    ]