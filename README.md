# MODVAL-Javeriana-2019
Repositorio taller de validacion de arquitectura Universidad Javeriana Bogota Colombia 
<!DOCTYPE html><html><head><meta charset="utf-8"><title>README.md</title>
<h1 class="code-line" data-line-start=0 data-line-end=1 ><a id="AESOF__Modelado_y_Validacin_de_Arquitectura_0"></a>AESOF - Modelado y Validación de Arquitectura</h1>
<h2 class="code-line" data-line-start=1 data-line-end=2 ><a id="Profesor_German_Suarez_1"></a>Profesor: German Suarez</h2>
<h2 class="code-line" data-line-start=2 data-line-end=3 ><a id="Estudiantes_2"></a>Estudiantes:</h2>
<pre><code>* Didier Chipatecua
* William Fierro
* Daniel González
* Andrés Lozano
</code></pre>
<h5 class="code-line" data-line-start=7 data-line-end=8 ><a id="Bogot_14_noviembre_2019_7"></a>Bogotá, 14 noviembre 2019</h5>
<h1 class="code-line" data-line-start=8 data-line-end=9 ><a id="_8"></a></h1>
<h1 class="code-line" data-line-start=9 data-line-end=10 ><a id="_9"></a></h1>
<h1 class="code-line" data-line-start=10 data-line-end=11 ><a id="_10"></a></h1>
<h1 class="code-line" data-line-start=11 data-line-end=12 ><a id="_11"></a></h1>
<h1 class="code-line" data-line-start=12 data-line-end=13 ><a id="_12"></a></h1>
<h1 class="code-line" data-line-start=13 data-line-end=14 ><a id="Taller_14_Banco_ABC_13"></a>Taller 1.4 Banco ABC</h1>
<h1 class="code-line" data-line-start=14 data-line-end=15 ><a id="_14"></a></h1>
<p class="has-line-data" data-line-start="15" data-line-end="17"><strong>1. Justificaciones de Arquitectura</strong><br>
<strong>2. Patrones de Arquitectura</strong></p>
<ul>
<li class="has-line-data" data-line-start="17" data-line-end="18"><strong>Cliente - Servidor</strong></li>
</ul>
<h1 class="code-line" data-line-start=18 data-line-end=19 ><a id="_18"></a></h1>
<p class="has-line-data" data-line-start="19" data-line-end="20"><img src="http://s.culturacion.com/wp-content/uploads/2011/06/Cliente-Servidor.gif.png" alt=""></p>
<p class="has-line-data" data-line-start="21" data-line-end="22">Es un patron el cual se aplica en sistemas distribuidos, y utiliza componentes de seguridad y notifica eventos.</p>
<h1 class="code-line" data-line-start=22 data-line-end=23 ><a id="_22"></a></h1>
<ul>
<li class="has-line-data" data-line-start="23" data-line-end="24"><strong>Intermediate Routing</strong></li>
</ul>
<h1 class="code-line" data-line-start=24 data-line-end=25 ><a id="_24"></a></h1>
<h4 class="code-line" data-line-start=25 data-line-end=26 ><a id="Problema_25"></a><strong>Problema</strong></h4>
<p class="has-line-data" data-line-start="27" data-line-end="28">Cuanto más grande y compleja es la composición de un servicio, más difícil es anticipar y diseñar de antemano todos los posibles escenarios de tiempo de ejecución, especialmente con la comunicación asincrónica basada en mensajes.</p>
<h4 class="code-line" data-line-start=29 data-line-end=30 ><a id="Solucin_29"></a><strong>Solución</strong></h4>
<p class="has-line-data" data-line-start="30" data-line-end="31">Las rutas de mensajes se pueden determinar dinámicamente mediante el uso de una lógica de enrutamiento intermediario</p>
<p class="has-line-data" data-line-start="32" data-line-end="33"><img src="https://patterns.arcitura.com/wp-content/uploads/2018/09/fig1-71.png" alt=""></p>
<ul>
<li class="has-line-data" data-line-start="35" data-line-end="37"><strong>Layers</strong></li>
</ul>
<p class="has-line-data" data-line-start="37" data-line-end="38"><img src="https://raw.githubusercontent.com/didierss/MODVAL-Javeriana-2019/master/Capas.JPG" alt=""></p>
<ul>
<li class="has-line-data" data-line-start="39" data-line-end="41"><strong>Vista de Despliegue</strong></li>
</ul>
<p class="has-line-data" data-line-start="41" data-line-end="42"><img src="https://raw.githubusercontent.com/didierss/MODVAL-Javeriana-2019/master/Fisico.JPG" alt=""></p>
<p class="has-line-data" data-line-start="43" data-line-end="44"><strong>3. Trade-off</strong></p>
<p class="has-line-data" data-line-start="45" data-line-end="46"><img src="https://raw.githubusercontent.com/didierss/MODVAL-Javeriana-2019/master/tradeoff.JPG" alt=""></p>
<p class="has-line-data" data-line-start="48" data-line-end="49"><strong>4. Estilos de arquitectura</strong></p>
<h4 class="code-line" data-line-start=50 data-line-end=51 ><a id="Microservicios_50"></a><strong>Microservicios</strong></h4>
<h1 class="code-line" data-line-start=52 data-line-end=53 ><a id="_52"></a></h1>
<p class="has-line-data" data-line-start="53" data-line-end="54"><img src="https://patterns.arcitura.com/wp-content/uploads/2018/09/fig1-31.png" alt=""></p>
<p class="has-line-data" data-line-start="55" data-line-end="56">Se escoge el estilo de arquitectura Microservicios, ya que basado en su patron Single Node Multi-Containers, podemos contenerizar el servicio enrutamiento, consulta y pagos. El servicio de enrutamiento estará conectado con una base de datos.</p>
<h3 class="code-line" data-line-start=57 data-line-end=58 ><a id="Referencias_57"></a>Referencias</h3>
<h1 class="code-line" data-line-start=58 data-line-end=59 ><a id="_58"></a></h1>
<table class="table table-striped table-bordered">
<thead>
<tr>
<th>Tema</th>
<th>Referencias</th>
</tr>
</thead>
<tbody>
<tr>
<td>Cliente - Servidor</td>
<td><a href="https://culturacion.com/cual-es-la-utilidad-de-las-aplicaciones-clienteservidor/">https://culturacion.com/cual-es-la-utilidad-de-las-aplicaciones-clienteservidor/</a></td>
</tr>
<tr>
<td>Intermediate Routing</td>
<td><a href="https://patterns.arcitura.com/soa-patterns/design_patterns/intermediate_routing">https://patterns.arcitura.com/soa-patterns/design_patterns/intermediate_routing</a></td>
</tr>
<tr>
<td>Single Node Multi-Containers</td>
<td><a href="https://patterns.arcitura.com/microservice-patterns/design_patterns/single_node_multicontainer">https://patterns.arcitura.com/microservice-patterns/design_patterns/single_node_multicontainer</a></td>
</tr>
</tbody>
</table>

</body></html>
