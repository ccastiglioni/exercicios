
bool ehprimo(in numero)
{

    for (int i = 2; i < numero; i++)
    {
        if (numero % i == 0)
        {
            retun false;
        }
        std::cout << "Elemento " << i << ": " << vetor[i] << std::endl;
    }
}