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
    type MiRecord = record
        nombre: CHARACTER
    end;
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
	    MiRecord.nombre := 'asd';
	end

	while valor1 = 1 do
	begin
		MiArray[1] := 2;
	end


	for i := 1 to 5 do
	begin
	    println(i);
	end

	case valor1 of
	    1:
            println(valor1);
	end
end.
