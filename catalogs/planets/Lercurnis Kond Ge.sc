DwarfPlanet	"Ge/Lercurnis B IV"
{
	ParentBody     "Kond"
	Class          "Terra"
	Mass            0.000379089994
	Radius          470
	InertiaMoment   0.398499995
	Obliquity       -8
	EqAscendNode    -79.6946565
	TidalLocked     true

	AbsMagn         1.85
	SlopeParam      6.32
	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_ge.cfg"
		SurfStyle       0.98
		Randomize      (0.118, 0.335, -0.269)
		colorDistMagn   0.052
		colorDistFreq   45.1
		detailScale     128
		drivenDarkening 0
		seaLevel        0.214
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  1.5
		icecapHeight    0
		climatePole     1
		climateTropic   0.563
		climateEquator  0.563
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.306
		heightTempGrad  0.375
		beachWidth      0.000843
		tropicWidth     0.5
		mainFreq        0.954
		venusFreq       0.641
		venusMagn       0.153
		mareFreq        0
		mareDensity     0.203
		terraceProb     0
		erosion         0
		montesMagn      0.02
		montesFreq      25
		montesSpiky     0.252
		montesFraction  1
		dunesMagn       0.0369
		dunesFreq       4.05
		dunesFraction   0.434
		hillsMagn       10
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      7
		riversFreq      6.79
		riversSin       7.05
		riftsMagn       1
		riftsFreq       7.48
		riftsSin        8.82
		canyonsMagn     0.1
		canyonsFreq     10
		canyonsFraction 0.924
		cracksMagn      0.1
		cracksFreq      1
		cracksOctaves   15
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0
		volcanoFreq     0.58
		volcanoDensity  0.13
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   1
		volcanoTemp     1.31e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.77
		stripeTwist     0.39
		cycloneMagn     0.695
		cycloneFreq     0.528
		cycloneDensity  0.344
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
		SpotBright      2.19
		SpotWidth       0.05
		DayAmbient      0.07
		TempMapMaxTemp  9e+04
	}

	NoOcean         true

	Clouds
	{
		Height          25
		Velocity        177
		BumpHeight      0.504
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.956
		ModulateColor  (0.832 0.783 0.764)
		ModulateBright  1
		Opacity         0.03
		mainFreq        0.321
		mainOctaves     10
		Coverage        0
		stripeZones     1.77
		stripeTwist     0.39
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Ge"
		Height          100
		Density         0.0321570002
		Pressure        0.0436000004
		Greenhouse      10
		Bright          1
		Opacity         0.7
		SkyLight        2.82
		Hue             0
		Saturation      1

		Composition
		{
			CO2       	50
			SO2       	50
		}
	}

	Climate
	{
		GlobalWindSpeed  31.4
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0465403051
		SemiMajorAxis   0.0638184318
		Eccentricity    0.35
		Inclination     -8
		AscendingNode   -79.6946565
		ArgOfPericenter 35.7251908
		MeanAnomaly     -222.59542
	}
}

