import Header from "src/components/header.jsx"



export default function Home(){
    return(
        <>
        <Header/>
        <div className="bg-green-300 min-h-screen" >
          <div className="text-black  ml-12 p-48">
        
          <h2 className="font-bold "> Quem somos nós? </h2>
          <p > Lentamente percebemos a influência da agropecuária sobre o aquecimento global e consequentemente, a <br/>
          eminência de falta de recursos e possibilidade de sobrevivência futura. Tendo em vista esta sentença, <br />
             decidimos conscientizar as pessoas do fato de que o maior inimigo do meio ambiente é a indústria agropecuária. </p>

          <h2 className="font-bold">Quais os benefícios de comer menos carne? </h2>
          <p> 1. Diminui risco de doenças cardiovasculares <br/>
            2. Economia: as proteínas vegetais são mais baratas que a carne <br/>
            3. Aumento de consumo de alimentos de origem vegetal. A ingestão de frutas e vegetais está abaixo do que é  <br/>recomendado pelo Ministério da Saúde <br/>
            4. Diminuição da ingestão de gorduras saturadas <br/>
            5. Diminuição da produção de gases estufa </p>

          <h2 className="font-bold" > Como eu posso começar? </h2>
          <p>  Estamos aqui para te ajudar nisso! Nosso site terá receitas e passo a passo do processo de mudança <br /> de outras pessoas. <br />
          Comendo menos carne, você está fazendo sua parte contra a crescente ameaça do aquecimento global. </p>
            </div>
          </div>
        


      
        </>
    )
}

