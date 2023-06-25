Planet	"Ignus/Lercurnis B V"
{
	ParentBody     "Kond"
	Class          "Ferria"
	Mass            8.7
	Radius          11460
	InertiaMoment   0.3307
	Obliquity       0.1
	EqAscendNode    -68.702
	TidalLocked     true

	AbsMagn         -5.082
	SlopeParam      7.143
	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (1.000 0.994 0.992)

	Surface
	{
		Preset         "lercurnis_kond_ignus.cfg"
		SurfStyle       0.27753
		Randomize      (-1.145, 1.267, 1.206)
		colorDistMagn   0.083308
		colorDistFreq   1007.2
		detailScale     3.3333e+05
		drivenDarkening 0
		seaLevel        0.0076336
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  2
		icecapHeight    0
		climatePole     1
		climateTropic   0.5625
		climateEquator  0.5625
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.35325
		heightTempGrad  0.375
		beachWidth      0.00087561
		tropicWidth     0.5
		mainFreq        1
		venusFreq       0.56489
		venusMagn       0.38168
		mareFreq        1.1911
		mareDensity     0
		terraceProb     0.27532
		erosion         0
		montesMagn      0.02
		montesFreq      100
		montesSpiky     1
		montesFraction  1
		dunesMagn       0
		dunesFreq       0
		dunesFraction   0
		hillsMagn       0.1
		hillsFreq       5
		hillsFraction   1
		hills2Fraction  1
		riversMagn      10
		riversFreq      10
		riversSin       8.0153
		riftsMagn       100
		riftsFreq       6.9466
		riftsSin        7.9371
		canyonsMagn     0.056776
		canyonsFreq     334.39
		canyonsFraction 0
		cracksMagn      0.10468
		cracksFreq      1.1177
		cracksOctaves   0
		craterMagn      0.5
		craterFreq      12
		craterDensity   1
		craterOctaves   30
		volcanoMagn     0
		volcanoFreq     0.29008
		volcanoDensity  1
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   0.29008
		volcanoTemp     2748.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     1.1118
		cycloneDensity  0.33497
		cycloneOctaves  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.4645
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          11.922
		Velocity        203.4
		BumpHeight      0.62215
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.39695
		mainFreq        1.4198
		mainOctaves     0
		Coverage        0.64122
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          11.922
		Velocity        203.4
		BumpHeight      0.85369
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.33588
		mainFreq        1.4198
		mainOctaves     0
		Coverage        0.64122
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          11.922
		Velocity        203.4
		BumpHeight      0.45341
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.35115
		mainFreq        1.4198
		mainOctaves     0
		Coverage        0.64122
		stripeZones     1
		stripeTwist     3.5
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Ignus"
		Height          100
		Density         311.48
		Pressure        622.15
		Greenhouse      311.48
		Bright          7
		Opacity         1
		SkyLight        3.3333
		Hue             0
		Saturation      1

		Composition
		{
			N2        	44
			H2O       	32.83
			NH3       	9.5109
			C2H4      	4.0759
			SO2       	3.5941
			CO2       	3.1143
			C2H2      	1.163
			H2S       	1.0887
			C2H6      	0.55136
			CH4       	0.038553
			C3H8      	0.021856
			C8H18     	0.0079746
			CO        	0.003253
			Ar        	0.00023444
			Cl2       	5.8011e-05
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.011326
		GasToDust   0
		Particles   10000
		GasBright   0.001
		DustBright  0.02
		GasColor   (0.000 0.000 0.000)
		DustColor  (0.016 0.023 0.031)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0855
		SemiMajorAxis   0.0836349064
		Eccentricity    0.0152671756
		Inclination     0.1
		AscendingNode   -68.7022901
		ArgOfPericenter -74.1984733
		MeanAnomaly     79.6946565
	}
}

