#language: pt
  Funcionalidade: Visualizar clientes
    como um usuário não logado
    Eu quero visualizar os clientes cadastrados
    Para poder escolher qual cliente vou interagir

  Cenario: Mostrar cliente com nome e-mail na primeira linha de cliente
    Dado que estou na página inicial
    Quando não estou logado
    Entao visualizo a  cliente "Aurora de Sá" com e-mail "mariajulia.rolim@live.com" na posição "1"