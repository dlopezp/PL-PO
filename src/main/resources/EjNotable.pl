program EjemploAprobado;
function areaCuadrado ( lado: REAL ) : REAL ;
var
	resultado: REAL;
begin
	resultado := +0.0;
	resultado := lado * lado;
	areaCuadrado := resultado;
end;
procedure intercambio ( v1, v2: INTEGER )  ;
var
	aux: INTEGER;
begin
	aux := 0;
	aux := v1;
	v1 := v2;
	v2 := aux;
end;
var
	medida: REAL;
	valor1, valor2: INTEGER;
    type MiArray = array[1..2] of INTEGER;
begin
	medida := $4.A;
	valor1 := -3;
	valor2 := $F6;
	medida := areaCuadrado( medida );
	intercambio(valor1, valor2);

	if valor1 = 1 then
	    valor1 := 0;
	else
	begin
	    valor1 := 2;
	end

	while valor1 = 1 do
	begin
		valor2 := 2;
	end
end.