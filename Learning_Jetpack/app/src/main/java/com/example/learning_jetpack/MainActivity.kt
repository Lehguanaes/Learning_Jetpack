package com.example.learning_jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learning_jetpack.ui.theme.Learning_JetpackTheme
import com.example.learning_jetpack.ui.theme.Rose
import com.example.learning_jetpack.ui.theme.Purple

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Learning_JetpackTheme {
                // CHAMA O GERENCIADOR DE OBJETOS
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // CHAMA A FUNÇÃO
                    Cadastro_Tela()
                }
            }
        }
    }
}

// CONSTRUIR/EXIBIR O PREVIEW JUNTO COM A MÁQUINA VIRTUAL
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Cadastro_Tela() {
    // Criação com um valor inicial vazio
    var nome by remember { mutableStateOf("") }
    var telefone by remember { mutableStateOf("") }
    var curso by remember { mutableStateOf("") }
    var serie by remember { mutableStateOf("") }

    // COLUNA PRINCIPAL DO APP
    Column() {  // BOX DENTRO DA COLUNA PRINCIPAL
        Box(
            Modifier
                .height(130.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            // CORES CRIADAS PARA O GRADIENTE
                            Purple, Rose
                        )
                    )
                )
                .fillMaxWidth()
        ) { // IMAGEM DENTRO DO BOX
            Image(
                painter = painterResource(id = R.drawable.usuario_hello_kitty),
                contentDescription = "DESCRIÇÃO",
                modifier = Modifier
                    .offset(y = (50).dp)
                    .clip(shape = CircleShape)
                    .align(Alignment.BottomCenter)
            )
        }
        Spacer(modifier = Modifier.height(50.dp))
        // COLUNA DE INFORMAÇÕES
        Column(
            Modifier
                .padding(16.dp)
        ) { // TEXTO PRINCIPAL
            Text(
                text = "Cadastro",
                modifier = Modifier
                    .fillMaxWidth() // Faz o texto ocupar a largura total disponível
                    .padding(top = 8.dp), // Apenas o padding superior
                fontSize = 23.sp, // Tamanho da fonte
                fontWeight = FontWeight.Bold, // Peso da fonte (negrito)
                color = Purple, // Cor Purple para o texto
                textAlign = TextAlign.Center, // Alinha o texto ao centro
                letterSpacing = 1.sp // Espaçamento entre as letras
            )
            // TEXTO SECUNDÁRIO
            Text(
                text = "Primeira vez? Cadastre-se!",
                modifier = Modifier
                    .fillMaxWidth() // Faz o texto ocupar a largura total disponível
                    .padding(top = 8.dp), // Apenas o padding superior
                fontSize = 18.sp, // Tamanho da fonte
                fontWeight = FontWeight.Medium, // Peso da fonte (negrito)
                color = Rose, // Cor Purple para o texto
                textAlign = TextAlign.Center, // Alinha o texto ao centro
                letterSpacing = 1.sp // Espaçamento entre as letras
            )
            // ESPAÇO ENTRE O TITULO
            Spacer(modifier = Modifier.height(20.dp))
            // ROWS DOS TEXTFILDS
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                // CAMPO NOME
                TextField(
                    value = nome,
                    onValueChange = { nome = it },
                    label = { Text("Nome:") },
                    modifier = Modifier
                        .fillMaxWidth() // Preenche a largura disponível
                        .padding(10.dp) // Adiciona padding
                        .heightIn(min = 10.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        focusedLabelColor = Purple, // Cor do label quando o campo estiver focado
                        unfocusedLabelColor = Purple, // Cor do label quando o campo não estiver focado
                    )
                )
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                // CAMPO TELEFONE
                TextField(
                    value = telefone,
                    onValueChange = { telefone = it },
                    label = { Text("Telefone:") },
                    modifier = Modifier
                        .fillMaxWidth() // Preenche a largura disponível
                        .padding(10.dp) // Adiciona padding
                        .heightIn(min = 10.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        focusedLabelColor = Purple, // Cor do label quando o campo estiver focado
                        unfocusedLabelColor = Purple, // Cor do label quando o campo não estiver focado
                    )
                )
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                // CAMPO CURSO
                TextField(
                    value = curso,
                    onValueChange = { curso = it },
                    label = { Text("Curso:") },
                    modifier = Modifier
                        .fillMaxWidth() // Preenche a largura disponível
                        .padding(10.dp) // Adiciona padding
                        .heightIn(min = 10.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        focusedLabelColor = Purple, // Cor do label quando o campo estiver focado
                        unfocusedLabelColor = Purple, // Cor do label quando o campo não estiver focado
                    )
                )
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                // CAMPO SÉRIE
                TextField(
                    value = serie,
                    onValueChange = { serie = it },
                    label = { Text("Série:") },
                    modifier = Modifier
                        .fillMaxWidth() // Preenche a largura disponível
                        .padding(10.dp) // Adiciona padding
                        .heightIn(min = 10.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        focusedLabelColor = Purple, // Cor do label quando o campo estiver focado
                        unfocusedLabelColor = Purple, // Cor do label quando o campo não estiver focado
                    )
                )
            }
            // ROW DO BOTÃO CADASTRAR
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
            ) {
                Button(
                    onClick = {
                        nome = ""
                        telefone = ""
                        curso = ""
                        serie = ""
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent), // Cor de fundo transparente, já que o gradiente é aplicado
                    modifier = Modifier
                        .height(50.dp) // Definindo altura do botão
                        .width(140.dp) // O botão vai preencher a largura disponível
                        .clip(RoundedCornerShape(25.dp)) // Arredonda as bordas do botão (proporcional)
                        .background(
                            brush = Brush.horizontalGradient(
                                colors = listOf(
                                    Purple, // Cor roxa para o gradiente
                                    Purple    // Cor rosa para o gradiente
                                )
                            )
                        )
                ) {
                    Text(
                        text = "Cadastrar",
                        color = Color.White,
                        fontSize = 15.sp
                    )
                }
            }
        }
        // COLUNA FINAL DO APP - RODAPÉ
        Spacer(modifier = Modifier.weight(1f)) // Empurra o rodapé para baixo


        // Rodapé
        Column(
            modifier = Modifier
                .fillMaxWidth() // Preenche toda a largura
                .height(50.dp) // Define a altura do rodapé
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Purple, // Cor roxa
                            Rose    // Cor rosa
                        )
                    )
                )
                .padding(8.dp), // Adiciona padding para espaçamento interno
            verticalArrangement = Arrangement.Center, // Centraliza o conteúdo verticalmente
            horizontalAlignment = Alignment.CenterHorizontally // Centraliza o conteúdo horizontalmente
        ) {
            // Texto do Copyright
            Text(
                text = "© 2025 | Letícia Guanaes Moreira",
                color = Color.White, // Cor do texto
                fontSize = 16.sp, // Tamanho da fonte
                fontWeight = FontWeight.Bold, // Deixa o texto em negrito
                textAlign = TextAlign.Center // Centraliza o texto
            )
            // Texto de Direitos Reservados
            Text(
                text = "Todos os direitos reservados.",
                color = Color.White, // Cor do texto
                fontSize = 16.sp, // Tamanho da fonte
                fontWeight = FontWeight.Bold, // Deixa o texto em negrito
                textAlign = TextAlign.Center // Centraliza o texto
            )
        }
    }
}