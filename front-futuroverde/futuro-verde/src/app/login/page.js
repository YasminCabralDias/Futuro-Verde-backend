import Header from '/src/components/header.jsx'


export default function Login() {
  return (
    <>
    <Header/>
    
        <div className="bg-scroll" style={{backgroundImage: `url('https://cdn.discordapp.com/attachments/1021132314446672003/1143281878762258463/image.png')`, height: "900px", backgroundSize: "cover"}}>
        <form class="flex flex-col justify-center items-center  ">
              <div class="md:flex md:items-center mb-6">
                <div class="md:w-1/3">
                  <label class="block text-gray-500 font-bold md:text-right mb-1 md:mb-0 pr-4" for="inline-full-name">
                    Email
                  </label>
                </div>
                <div class="md:w-2/3">
                  <input class="bg-gray-200 appearance-none border-2 border-gray-200 rounded w-full py-2 px-4 text-gray-700 leading-tight focus:outline-none focus:bg-white focus:bg-white" id="inline-full-name" type="text" value="Jane Doe"/>
                </div>
              </div>
              <div class="md:flex md:items-center mb-6">
                <div class="md:w-1/3">
                  <label class="block text-gray-500 font-bold md:text-right mb-1 md:mb-0 pr-4" for="inline-password">
                    Senha
                  </label>
                </div>
                <div class="md:w-2/3">
                  <input class="bg-gray-200 appearance-none border-2 border-gray-200 rounded w-full py-2 px-4 text-gray-700 leading-tight focus:outline-none focus:bg-white focus:bg-white" id="inline-password" type="password" placeholder="******************"/>
                </div>
              </div>
              <div class="md:flex md:items-center mb-6">
                <div class="md:w-1/3"></div>
                <label class="md:w-2/3 block text-gray-500 font-bold">
                  
                </label>
              </div>
              <div class="md:flex md:items-center">
                <div class="md:w-1/3"></div>
                <div class="md:w-2/3">
                  <button class="shadow bg-white hover:bg-whitefocus:shadow-outline focus:outline-none text-black font-bold py-2 px-4 rounded" type="button">
                    Entrar
                  </button>
                </div>
              </div>
            </form>
        </div>
        
        
   
    </>
  )
}
