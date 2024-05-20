Planet	"Kou/Caecus I"
{
	ParentBody     "Oblitus es"
	Class          "Ferria"
	Mass            0.32
	Radius          3.45e+03
	InertiaMoment   0.329
	Obliquity       0.1
	EqAscendNode    -35.7
	TidalLocked     true

	EndogenousHeating 0.0941
	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (1.000 0.857 0.588)

	Interior
	{
		Composition
		{
			Metals		100
		}
	}

	Surface
	{
		Preset         "caecus_kou.cfg"
		SurfStyle       0.992
		Randomize      (1.328, 1.634, 1.267)
		colorDistMagn   0.0638
		colorDistFreq   368
		detailScale     128
		drivenDarkening 0.374
		seaLevel        -0.198
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  0.763
		icecapHeight    0.0352
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.383
		heightTempGrad  0.625
		beachWidth      0.00107
		tropicWidth     0.07
		mainFreq        1.72
		venusFreq       1.56
		venusMagn       0.649
		mareFreq        2
		mareDensity     0.382
		terraceProb     0.124
		erosion         1
		montesMagn      0.2
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.0335
		dunesFreq       31.8
		dunesFraction   0.799
		hillsMagn       2
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      56.9
		riversFreq      3.93
		riversSin       6.95
		riftsMagn       56.9
		riftsFreq       2.07
		riftsSin        6.26
		eqridgeMagn     0.496
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  6.26
		canyonsMagn     0.466
		canyonsFreq     1.21
		canyonsFraction 0.532
		cracksMagn      0
		cracksFreq      0
		cracksOctaves   0
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0.382
		volcanoFreq     0.947
		volcanoDensity  0.137
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      19.1
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           0.748
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Pluto"
		Height          100
		Density         7.33e-06
		Pressure        1e-06
		Greenhouse      0.000114
		Bright          0.2
		Opacity         1
		SkyLight        0.333
		Hue             -0.01
		Saturation      1.3

		Composition
		{
			Ne        	99.4
			N2        	0.58
			Ar        	0.000404
			CO        	1.07e-05
		}
	}

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          2.72897087
		SemiMajorAxis   1.6
		Eccentricity    0.0152671756
		Inclination     0.1
		AscendingNode   -35.7251908
		ArgOfPericenter -57.7099237
		MeanAnomaly     30
	}
}

