#!/bin/bash



find requirements/ -iname "*.tex" | sort | awk '{printf "\\input{%s}\n", $1}' > inputs.tex

latex main && makeglossaries main && latex main && makeglossaries main && latex main && latex main && dvips main && ps2pdf main.ps
