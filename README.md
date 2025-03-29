Programación móvil - 2025

![image](https://github.com/user-attachments/assets/2135cf55-21eb-44d4-802d-fe2c6e87fd31)
 
📌 Descripción
La aplicación “Engineering English App” está pensada para ser un método de estudio y repaso del idioma inglés con un enfoque al vocabulario técnico que usan y requieren las distintas ingenierías, de tal forma, esta app permite a los usuarios configurar su perfil y preferencias, incluyendo la carga y eliminación de una foto de perfil, administración de una cuenta personal con nombre de usuario, profesión, idioma nativo, tema (oscuro o claro) y activación o desactivación de notificaciones.
🚀 Funcionalidades
•	Carga y eliminación de foto de perfil (con persistencia en LiveData)
•	Modificación de datos personales: nombre de usuario, profesión e idioma nativo aplicable a todo el UI
•	Cambio de tema: modo claro u oscuro (persistente en el UI)
•	Activación/desactivación de notificaciones
•	Persistencia de datos 

![image](https://github.com/user-attachments/assets/fd3b54b1-4bc7-46ac-81bc-bb0f35a9d6d6)

🛠️ Tecnologías Utilizadas
•	Kotlin (para la lógica de la aplicación)
•	Jetpack Compose (para la UI)
•	Coil (para carga de imágenes)
📜 Explicación de Archivos Claves
ThemeViewModel.kt
Gestiona los datos del usuario y la persistencia.
•	loadUserData(): Carga los datos guardados.
•	updateProfilePicture(uri: String?): Guarda la foto de perfil.
•	saveToDataStore(key: String, value: String): Guarda datos con LiveData.

![image](https://github.com/user-attachments/assets/2c803678-8922-4c31-b58d-905fc89b7b18)
 
SettingsScreen.kt
Pantalla donde el usuario puede cambiar su configuración.

•	Muestra y permite cambiar la foto de perfil usando AsyncImage (Coil).

•	Botón para seleccionar una imagen desde la galería.

•	Botón para eliminar la foto de perfil.

•	Formularios para editar datos personales.

•	Switch para cambiar entre modo oscuro y claro.

•	Switch para activar o desactivar notificaciones.
 
🛠️ Futuras Mejoras
•	Implementar Firebase para almacenamiento de imágenes.

•	Agregar validaciones en los formularios.

•	Mejorar la experiencia de usuario con animaciones.

 ![image](https://github.com/user-attachments/assets/7359a919-e68e-44fe-afe0-fd1f31441bb2)

🙌 Instalación y Uso

Clona este repositorio:

git clone https://github.com/JDNG111/Corte1_app_Navarro.git

Abre el proyecto en Android Studio.

Conéctalo a un emulador o dispositivo físico.

Ejecuta la app y personaliza tu perfil. 🎨

________________________________________
Hecho por:
Julian David Navarro G.
Programación movil
