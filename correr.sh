#!/bin/bash
# Compila y ejecuta duo-mate.
# Uso:  bash correr.sh                 -> compila y abre la app (Main)
#       bash correr.sh PruebaConexion  -> compila y corre otra clase

cd "$(dirname "$0")"

# En Windows el classpath se separa con ; y en Mac/Linux con :
SEPARADOR=":"
case "$(uname -s)" in
    MINGW*|MSYS*|CYGWIN*) SEPARADOR=";" ;;
esac

echo "Compilando..."
javac -encoding UTF-8 -cp "lib/*" -d bin src/*.java || { echo "Hay errores de compilacion"; exit 1; }
echo "Compilacion exitosa"

java -cp "bin${SEPARADOR}lib/*" "${1:-Main}"
